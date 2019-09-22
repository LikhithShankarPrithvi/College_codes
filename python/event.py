import pygame
pygame.init()
dis=[400,300]
display=pygame.display.set_mode(dis)
exit=false
while not exit:
    for event in pygame.event.get():
        if (event.type == pygame.QUIT()):
            print(event)
        else:
            exit= true
pygame.display.update()
